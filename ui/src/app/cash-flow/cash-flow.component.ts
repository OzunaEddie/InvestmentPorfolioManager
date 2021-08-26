import { AfterViewChecked, Component, Input, OnInit } from '@angular/core';


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
  label!:string;
  colorScheme: any;

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
    this.view = [700, 400];
    this.gradient = true;
    this.showLegend = false;
    this.showLabels = false;
    this.isDoughnut = false;
    this.label = ""
    this.colorScheme = {
      domain: ['#5AA454', '#A10A28', '#C7B42C', '#AAAAAA']
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