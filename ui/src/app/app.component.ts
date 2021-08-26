import { Component } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ui';
  accountId:number = 1;
  accountInfo:any = {};
  totalCash = 0;
  totalInvestment = 0;
  netWorth = 0;

  constructor(private typicodeService:TypicodeService) {

    this.setAccount();
    
  }

  setAccount(){
    this.typicodeService.getAccountByIdApi(this.accountId)
    .subscribe( (data) => {
      this.accountInfo = data
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
