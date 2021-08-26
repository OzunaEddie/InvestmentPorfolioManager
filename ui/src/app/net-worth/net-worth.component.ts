import { Component, Input, OnInit, AfterViewChecked } from '@angular/core';
import { BarChartOption, ChartData, ChartView } from 'ngx-chart';

@Component({
  selector: 'app-net-worth',
  templateUrl: './net-worth.component.html',
  styleUrls: ['./net-worth.component.css']
})
export class NetWorthComponent implements AfterViewChecked, OnInit {

  @Input() netWorth:any;
  chartData: ChartData[] = [];
  chartOptions!: BarChartOption;
  barView!: ChartView;

  




  constructor() {
    
   }

  ngOnInit(): void {

    //console.log(this.netWorth, "here");
  }

  ngAfterViewChecked() {
    //console.log(this.netWorth, "here");
  }

  ngOnChanges() {
    this.displayNetWorthChartData()
  }

  displayNetWorthChartData() {
      this.chartData = [
    { name: "India", value: 1, color: "#61b15a" },
    { name: "Nepal", value: 5, color: "#adce74" },
    
  ];
  this.chartOptions = {
    roundedCorners: false,
    showLegend: true,
    legendTitle: 'Total',
    isHorizontal: false
  }
  this.barView = {
    height: 400,
    width: 400
  }
}

}

