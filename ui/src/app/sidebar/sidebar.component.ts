import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  @Input() accountInfo:any;
  @Input() totalCash:number = 0;
  @Input() totalInvestment:number = 0;
  @Input() netWorth:number = 0;
  @Output() sendToRoot = new EventEmitter<any>();
  displayInvestmentList = false;
  displayCashList = false;
  investmentApiCallMade = false;
  bankApiCallMade = false;
  investmentList:any = [];
  bankAccountList:any = [];
  shareCountList:any = []
  constructor(private typicodeService:TypicodeService){}
  accountId:any;
  ngOnInit(): void {
  }

  onSubmit(accountId:any){
    this.sendToRoot.emit(this.accountId)
  }
  
  ngOnChanges(){
    this.getInvestmentList();
    this.getCashList();
  }

  getInvestmentList(){
    this.displayInvestmentList = !this.displayInvestmentList;
    console.log(this.accountInfo)
    if(this.displayInvestmentList && !this.investmentApiCallMade){
      this.accountInfo['portfolio'].forEach((element: any, index: number) => {

        
        if(element['typeOfInstrument'] == "stock"){
          this.typicodeService.getStockByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
            this.shareCountList.push(element['shareCount'])
          });
        }

        if(element['typeOfInstrument'] == "bond"){
          this.typicodeService.getBondByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
            this.shareCountList.push(element['shareCount'])
          });
        }

        if(element['typeOfInstrument'] == "etf"){
          this.typicodeService.getEtfByIdApi(element['instruments']['instrumentId'])
          .subscribe( (data) => {
            this.investmentList.push(data);
            this.shareCountList.push(element['shareCount'])
            
          });
        }
      });
      this.investmentApiCallMade = true;
    }

  }

  getCashList(){
    this.displayCashList = !this.displayCashList;
    if(this.displayCashList && !this.bankApiCallMade){
      this.accountInfo['bankAccount'].forEach((element: any) => {
        this.bankAccountList.push(element);
      });
      this.bankApiCallMade = true;
    }
  }

}
