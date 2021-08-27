import { Component, ElementRef, ViewChild } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  accountId:any;
  title = 'ui';
  accountInfo:any = {};
  totalCash = 0;
  totalInvestment = 0;
  netWorth = 0;
  income = 0;

  constructor(private typicodeService:TypicodeService) {

    this.setAccountId(1);
    
  }


  

  setAccountId(accountId: any):void {
    this.totalCash = 0;
    this.totalInvestment = 0;
    this.accountId = accountId;
    console.log(this.accountId)
    console.log(accountId)
    this.typicodeService.getAccountByIdApi(this.accountId)
    .subscribe( (data) => {
      this.accountInfo = data
      this.income = this.accountInfo['income']
      this.accountInfo['bankAccount'].forEach((element: any) => {
        this.totalCash += element['cashValue'];
        
      });
      this.accountInfo['portfolio'].forEach((element: any) => {
        this.totalInvestment += (element['value'] * element['shareCount']);
        
      });
      this.netWorth = this.totalCash + this.totalInvestment
    });
  }

  
}
