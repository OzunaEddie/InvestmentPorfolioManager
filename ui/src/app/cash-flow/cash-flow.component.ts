import { AfterViewChecked, Component, Input, OnInit } from '@angular/core';
import { ChartData, ChartOption, PieChartView } from 'ngx-chart';

@Component({
  selector: 'app-cash-flow',
  templateUrl: './cash-flow.component.html',
  styleUrls: ['./cash-flow.component.css']
})
export class CashFlowComponent {
  @Input() cashFlow:any;
  single!: any[];
  view: [number, number] = [700, 400];

  // options
  gradient!: boolean;
  showLegend!: boolean;
  showLabels!: boolean;
  isDoughnut!: boolean;
  legendPosition!: string;

  colorScheme = {
    domain: ['#5AA454', '#A10A28', '#C7B42C', '#AAAAAA']
  };

  constructor() {

  }

  ngOnChanges() {
    this.displayCashFlowChart()
  }

  displayCashFlowChart() {
    this.single =  [
      {
        "name": "Germany",
        "value": 8940000
      },
      {
        "name": "USA",
        "value": 5000000
      },
      {
        "name": "France",
        "value": 7200000
      },
        {
        "name": "UK",
        "value": 6200000
      }
    ];
    this.view = [700, 400];
    this.gradient = true;
    this.showLegend = true;
    this.showLabels = true;
    this.isDoughnut = false;
    
  }

}