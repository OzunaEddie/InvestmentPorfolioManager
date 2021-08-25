import { Component, Input, OnInit } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  @Input() accountInfo:any;

  displayInvestmentList = false;
  displayCashList = false;
  investmentApiCallMade = false;
  bankApiCallMade = false;
  totalInvestment = 0;
  investmentList:any = []
  bankAccountList:any = []

  constructor(private typicodeService:TypicodeService){}

  ngOnInit(): void {
  }


  getInvestmentList(){
    this.displayInvestmentList = !this.displayInvestmentList;
    if(this.displayInvestmentList && !this.investmentApiCallMade){
      this.accountInfo['portfolio'].forEach((element: any) => {
        if(element['typeOfInstrument'] == "stock"){
          this.typicodeService.getStockByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
          });
        }

        if(element['typeOfInstrument'] == "bond"){
          this.typicodeService.getBondByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
          });
        }

        if(element['typeOfInstrument'] == "etf"){
          this.typicodeService.getEtfByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
          });
        }

      });
      this.investmentApiCallMade = true;
    }

  }

  getCashList(){
    this.displayCashList = !this.displayCashList;
    console.log(this.accountInfo['bankAccount'])
    if(this.displayCashList && !this.bankApiCallMade){
      this.accountInfo['bankAccount'].forEach((element: any) => {
        this.bankAccountList.push(element);
      });
      this.bankApiCallMade = true;
    }
  }

}
