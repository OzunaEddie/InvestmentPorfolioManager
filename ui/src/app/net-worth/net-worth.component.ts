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
            "name": "2019",
            "value": 62000000
          },
          {
            "name": "2020",
            "value": 73000000
          },
          {
            "name": "2021",
            "value": 89400000
          }
        ]
      },
    ],
    this.views = [1150, 450]
    //break
    this.legend = false;
    this.showLabels = true;
    this.animations = true;
    this.xAxis = false;
    this.yAxis = false;
    this.showYAxisLabel = false;
    this.showXAxisLabel = false;
    this.xAxisLabel = 'Net Worth';
    this.yAxisLabel = 'Money Count';
    this.timeline = true;
    this.timeline = true;
    this.maxXAxisTickLength = 3

  this.colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };

}





}

