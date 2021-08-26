import { AfterViewChecked, Component, Input, OnInit } from '@angular/core';


@Component({
  selector: 'app-cash-flow',
  templateUrl: './cash-flow.component.html',
  styleUrls: ['./cash-flow.component.css']
})
export class CashFlowComponent {
  @Input() income:any;
  single!: any[];
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