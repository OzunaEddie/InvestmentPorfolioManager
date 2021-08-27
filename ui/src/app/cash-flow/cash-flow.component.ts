import { AfterViewChecked, Component, Input, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';

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
  spendingAmount: any;
  constructor(private cookieService: CookieService) {
    
  }

  ngOnChanges() {
    this.displayCashFlowChart()
  }

  displayCashFlowChart() {
    
    if(this.cookieService.get( 'id') == "1"){
      this.pieSpend =  [
        {
          "name": "FXNAX",
          "value": 134.22
        },
        {
          "name": "DODGX",
          "value": 233.43
        },
        {
          "name": "VWEHX",
          "value": 90.51
        },
        {
          "name": "AGG",
          "value": 111.20
        }
      ];

      this.pieIncome = [
        {
            "name": "DIS",
            "value": this.income / 2
        },
    
        {
            "name": "APPL",
            "value": this.income /3 
        },
    
        {
            "name": "TSLA",
            "value": this.income / 4
        },
        {
            "name": "Cash",
            "value": this.income / 5
        }
    ];

      this.spendingAmount = 134.22 + 233.43 + 90.51 + 111.20
    }

    if(this.cookieService.get( 'id') == "2"){
      this.pieSpend =  [
        {
          "name": "FXNAX",
          "value": 534.22
        },
        {
          "name": "DODGX",
          "value": 633.43
        },
        {
          "name": "VWEHX",
          "value": 190.51
        },
        {
          "name": "AGG",
          "value": 711.20
        }
      ];

      this.pieIncome = [
        {
            "name": "DIS",
            "value": this.income / 30
        },
    
        {
            "name": "APPL",
            "value": this.income / 40
        },
    
        {
            "name": "TSLA",
            "value": this.income / 50
        },
        {
            "name": "Cash",
            "value": this.income / 60
        },
        {
          "name": "AMZ",
          "value": this.income / 70
      }
    ];
      this.spendingAmount = 534.22 + 633.43 + 190.51 + 711.20
    }

    if(this.cookieService.get( 'id') == "3"){
      this.pieSpend =  [
        {
          "name": "FXNAX",
          "value": 934.22
        },
        {
          "name": "DODGX",
          "value": 1233.43
        },
        {
          "name": "VWEHX",
          "value": 490.51
        },
        {
          "name": "AMZ",
          "value": 1111.20
        },
        {
          "name": "AGG",
          "value": 5000.20
        }, {
          "name": "AGG",
          "value": 6111.20
        }
      ];

      this.pieIncome = [
        {
            "name": "DIS",
            "value": this.income / 90
        },
    
        {
            "name": "APPL",
            "value": this.income / 100
        },
    
        {
            "name": "TSLA",
            "value": this.income / 200
        },
        {
            "name": "AMZ",
            "value":this.income / 400
        },
        {
          "name": "DPZ",
          "value":this.income / 500
      },
          {
            "name": "DIS",
            "value":this.income / 600
        }
    ];
      this.spendingAmount = 934.22 + 1233.43 + 490.51 + 5000.20
    }
    this.view = [300, 300];
    this.gradient = true;
    this.showLegend = false;
    this.showLabels = false;
    this.isDoughnut = true;
    this.label = ""
   
    // top right, bottom right, bottom left, top left
    this.incomeColorScheme = {
      domain: ['#010358', '#bad4ff', '#365b98', '#7dd2ff', '#993c04', '#7d1d01']
    };
    
    this.spendColorScheme = {
      domain: ['#ff9514', '#8f1818', '#ff5900', '#d81c1c', '#993c04', '#7d1d01']
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