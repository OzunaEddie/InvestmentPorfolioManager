import { Component, Input, OnInit, AfterViewChecked } from '@angular/core';
import { BarChartOption, ChartData, ChartView } from 'ngx-chart';
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

  constructor() {
    
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
    this.multi = [
      {
        "name": "netWorth",
        "series": [
          {
            "name": "1",
            "value": (this.netWorth/8.75)
          },
          {
            "name": "2",
            "value": (this.netWorth/8.50)
          },
          {
            "name": "3",
            "value": (this.netWorth/8.25)
          },
          {
            "name": "4",
            "value": (this.netWorth/8.15)
          },
          {
            "name": "5",
            "value": (this.netWorth/8.00)
          },
          {
            "name": "6",
            "value": (this.netWorth/7.66)
          },
          {
            "name": "7",
            "value": (this.netWorth/7.45)
          },
          {
            "name": "8",
            "value": (this.netWorth/7.37)
          },
          {
            "name": "9",
            "value": (this.netWorth/7.10)
          },
          {
            "name": "10",
            "value": (this.netWorth/6.47)
          },
          {
            "name": "11",
            "value": (this.netWorth/6.36)
          },
          {
            "name": "12",
            "value": (this.netWorth/6.10)
          },
          {
            "name": "13",
            "value": (this.netWorth/5.48)
          },
          {
            "name": "14",
            "value": (this.netWorth/5.22)
          },
          {
            "name": "15",
            "value": (this.netWorth/4.90)
          },
          {
            "name": "16",
            "value": (this.netWorth/4.20)
          },
          {
            "name": "17",
            "value": (this.netWorth/4.10)
          },
          {
            "name": "18",
            "value": (this.netWorth/3.60)
          },
          {
            "name": "19",
            "value": (this.netWorth/3.10)
          },
          {
            "name": "20",
            "value": (this.netWorth/3.00)
          },
          {
            "name": "21",
            "value": (this.netWorth/3.60)
          },
          {
            "name": "22",
            "value": (this.netWorth/3.70)
          },
          {
            "name": "23",
            "value": (this.netWorth/3.90)
          },
          {
            "name": "24",
            "value": (this.netWorth/2.50)
          },
          {
            "name": "25",
            "value": (this.netWorth/2.10)
          },
          {
            "name": "26",
            "value": (this.netWorth/2.00)
          },
          {
            "name": "27",
            "value": (this.netWorth/1.50)
          },
          {
            "name": "28",
            "value": (this.netWorth/1.20)
          },
          {
            "name": "29",
            "value": (this.netWorth/ 1.10)
          },
          {
            "name": "30",
            "value": (this.netWorth)
          },
        ]
      },
    ],
    this.views = [1110, 450]
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

