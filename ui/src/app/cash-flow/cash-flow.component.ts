import { AfterViewChecked, Component, Input, OnInit } from '@angular/core';
import { pieIncome } from './acc-1';

@Component({
  selector: 'app-cash-flow',
  templateUrl: './cash-flow.component.html',
  styleUrls: ['./cash-flow.component.css']
})
export class CashFlowComponent {
  @Input() income:any;
  pieSpend!: any[];
  pieIncome!: any[];
  view:any = [];

  // options
  gradient!: boolean;
  showLegend!: boolean;
  showLabels!: boolean;
  isDoughnut!: boolean;
  legendPosition!: string;
  label!:string;
  incomeColorScheme: any;
  spendColorScheme: any;

  constructor() {
    this.displayCashFlowChart()
  }

  ngOnChanges() {
    
  }

  displayCashFlowChart() {
    Object.assign(this, {pieIncome});
    
    this.pieSpend =  [
      {
        "name": "FXNAX",
        "value": 8940000
      },
      {
        "name": "DODGX",
        "value": 5000000
      },
      {
        "name": "VWEHX",
        "value": 7200000
      }
    ];
    this.view = [300, 300];
    this.gradient = true;
    this.showLegend = false;
    this.showLabels = false;
    this.isDoughnut = true;
    this.label = ""
   
    // top right, bottom right, bottom left, top left
    this.incomeColorScheme = {
      domain: ['#010358', '#bad4ff', '#365b98', '#7dd2ff']
    };
    
    this.spendColorScheme = {
      domain: ['#ff9514', '#8f1818', '#ff5900', '#d81c1c']
    };
    
  }

  valueFormatting(value:any) {
    value=false;

  }

  onSelect(data: any): void {
    console.log('Item clicked', JSON.parse(JSON.stringify(data)));
  }

  onActivate(data: any): void {
    console.log('Activate', JSON.parse(JSON.stringify(data)));
  }

  onDeactivate(data: any): void {
    console.log('Deactivate', JSON.parse(JSON.stringify(data)));
  }

}