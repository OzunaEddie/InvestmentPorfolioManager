import { Component } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ui';
  accountId:number = 1
  accountInfo = {}
  totalCash = 0

  constructor(private typicodeService:TypicodeService) {

    this.setAccount();
    
  }

  setAccount(){
    this.typicodeService.getAccountByIdApi(this.accountId)
    .subscribe( (data) => {
      this.accountInfo = data
    });
  }
  
  
}
