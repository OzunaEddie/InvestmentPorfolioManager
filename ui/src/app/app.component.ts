import { Component, ElementRef, ViewChild } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';
import { CookieService } from 'ngx-cookie-service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  accountId:any = 1;
  title = 'ui';
  accountInfo:any = {};
  totalCash = 0;
  totalInvestment = 0;
  netWorth = 0;
  income = 0;

  constructor(private typicodeService:TypicodeService, private cookieService: CookieService) {

    this.setAccountId(this.cookieService.get( 'id'))
    this.getAccountInfo()
    
  }


  setAccountId(accountId: any){
    this.cookieService.set( 'id',accountId)
  }
  

  getAccountInfo():void {
    
    this.accountId = this.cookieService.get( 'id')
    this.totalCash = 0;
    this.totalInvestment = 0;
    console.log(this.accountId)
    console.log(this.accountId )
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
