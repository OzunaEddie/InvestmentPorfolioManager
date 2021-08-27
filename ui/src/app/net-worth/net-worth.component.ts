import { Component, Input, OnInit, AfterViewChecked } from '@angular/core';
import { BarChartOption, ChartData, ChartView } from 'ngx-chart';
import { CookieService } from 'ngx-cookie-service';
import { multi } from './data';

@Component({
  selector: 'app-net-worth',
  templateUrl: './net-worth.component.html',
  styleUrls: ['./net-worth.component.css']
})
export class NetWorthComponent  {

  @Input() netWorth:any;
  multi: any[] = [];
  views: any = [];

  // options
  legend!: boolean
  showLabels!: boolean 
  animations!: boolean 
  xAxis!: boolean 
  yAxis!: boolean 
  showYAxisLabel!: boolean 
  showXAxisLabel!: boolean 
  xAxisLabel!: string 
  yAxisLabel!: string 
  timeline!: boolean 
  maxXAxisTickLength!:number;
  colorScheme!:any;
  accountOne:any = []
  accountTwo:any = []
  accountThree:any = []
  fractionList:any = []

  constructor(private cookieService: CookieService) {
    
  }

   onSelect(event:any) {
     console.log(event);
   }


  ngOnInit(): void {

    
  }
  
 
  ngOnChanges() {
    this.displayNetWorthChartData()
    
    
  }

  displayNetWorthChartData() {

    for(let i = 0; i < 30; i++){
     this.accountOne.push(i/1.2)
     this.accountTwo.push(i/0.90)
     this.accountThree.push(i/0.50)
    }

    if(this.cookieService.get( 'id') == "1"){
      this.fractionList = this.accountOne
    }
    
    if(this.cookieService.get( 'id') == "2"){
      this.fractionList = this.accountTwo
    }

    if(this.cookieService.get( 'id') == "3"){
      this.fractionList = this.accountThree
    }

    this.multi = [
      {
        "name": "netWorth",
        "series": [
          {
            "name": "1",
            "value": (this.netWorth/this.fractionList[29])
          },
          {
            "name": "2",
            "value": (this.netWorth/this.fractionList[28])
          },
          {
            "name": "3",
            "value": (this.netWorth/this.fractionList[27])
          },
          {
            "name": "4",
            "value": (this.netWorth/this.fractionList[26])
          },
          {
            "name": "5",
            "value": (this.netWorth/this.fractionList[25])
          },
          {
            "name": "6",
            "value": (this.netWorth/this.fractionList[24])
          },
          {
            "name": "7",
            "value": (this.netWorth/this.fractionList[23])
          },
          {
            "name": "8",
            "value": (this.netWorth/this.fractionList[22])
          },
          {
            "name": "9",
            "value": (this.netWorth/this.fractionList[21])
          },
          {
            "name": "10",
            "value": (this.netWorth/this.fractionList[20])
          },
          {
            "name": "11",
            "value": (this.netWorth/this.fractionList[19])
          },
          {
            "name": "12",
            "value": (this.netWorth/this.fractionList[18])
          },
          {
            "name": "13",
            "value": (this.netWorth/this.fractionList[17])
          },
          {
            "name": "14",
            "value": (this.netWorth/this.fractionList[16])
          },
          {
            "name": "15",
            "value": (this.netWorth/this.fractionList[15])
          },
          {
            "name": "16",
            "value": (this.netWorth/this.fractionList[14])
          },
          {
            "name": "17",
            "value": (this.netWorth/this.fractionList[13])
          },
          {
            "name": "18",
            "value": (this.netWorth/this.fractionList[12])
          },
          {
            "name": "19",
            "value": (this.netWorth/this.fractionList[11])
          },
          {
            "name": "20",
            "value": (this.netWorth/this.fractionList[10])
          },
          {
            "name": "21",
            "value": (this.netWorth/this.fractionList[9])
          },
          {
            "name": "22",
            "value": (this.netWorth/this.fractionList[8])
          },
          {
            "name": "23",
            "value": (this.netWorth/this.fractionList[7])
          },
          {
            "name": "24",
            "value": (this.netWorth/this.fractionList[6])
          },
          {
            "name": "25",
            "value": (this.netWorth/this.fractionList[5])
          },
          {
            "name": "26",
            "value": (this.netWorth/this.fractionList[4])
          },
          {
            "name": "27",
            "value": (this.netWorth/this.fractionList[3])
          },
          {
            "name": "28",
            "value": (this.netWorth/this.fractionList[2])
          },
          {
            "name": "29",
            "value": (this.netWorth/ this.fractionList[1])
          },
          {
            "name": "30",
            "value": (this.netWorth)
          },
        ]
      },
    ],
    this.views = [1047, 450]
    //break
    this.legend = false;
    this.showLabels = true;
    this.animations = true;
    this.xAxis = false;
    this.yAxis = false;
    this.showYAxisLabel = true;
    this.showXAxisLabel = false;
    this.xAxisLabel = 'Net Worth';
    this.yAxisLabel = 'Money Count';
    this.timeline = true;
    this.timeline = true;
    this.maxXAxisTickLength = 3

  this.colorScheme = {
    domain: ['#003b70', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };

}




  
}

