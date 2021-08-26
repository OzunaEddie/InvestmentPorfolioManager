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
  view: any[] = [700, 300];

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
  //legend: boolean = true;
  // showLabels: boolean = true;
  // animations: boolean = true;
  // xAxis: boolean = true;
  // yAxis: boolean = true;
  // showYAxisLabel: boolean = true;
  // showXAxisLabel: boolean = true;
  // xAxisLabel: string = 'Year';
  // yAxisLabel: string = 'Population';
  //timeline!: boolean = true;
  colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };

  constructor() {
    
  }

//   onSelect(event:any) {
//     console.log(event);
//   }


//   ngOnInit(): void {

//     //console.log(this.netWorth, "here");
//   }

 
  ngOnChanges() {
    this.displayNetWorthChartData()
    
    //this.legend = true;
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
    //break
    this.legend = false;
    this.showLabels = true;
    this.animations = true;
    this.xAxis = true;
    this.yAxis = true;
    this.showYAxisLabel = true;
    this.showXAxisLabel = true;
    this.xAxisLabel = 'Net Worth';
    this.yAxisLabel = 'Money Count';
    this.timeline = true;
    this.timeline = true;

  this.colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };



}





}

