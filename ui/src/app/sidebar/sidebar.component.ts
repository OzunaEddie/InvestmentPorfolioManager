import { Component, OnInit } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  reportData = {} 
  displayInvestmentList = false;
  displayCashList = false;
  investmentList = [
    {symbol:'AMZN', price:42},
    {symbol:'NFLX', price:12}, 
    {symbol:'GOOGL', price:142},
    {symbol:'FB', price:82},
    {symbol:'AAPL', price:11},
  ]

  cashList = [
    {bank:'Well Fargo', amount:2000},
    {bank:'Citi', amount:300}, 
    {bank:'Discovery', amount:4000},
  ]


  constructor(private typicodeService:TypicodeService){}

  ngOnInit(): void {
  }

  makeServiceCall(){
    this.typicodeService.getAccountApi()
    .subscribe( (data) => {
      this.reportData = data;
    });
  }

  getInvestmentList(){
    this.displayInvestmentList = !this.displayInvestmentList;
    if(this.displayInvestmentList){

    }
  }

  getCashList(){
    this.displayCashList = !this.displayCashList;

  }

}
