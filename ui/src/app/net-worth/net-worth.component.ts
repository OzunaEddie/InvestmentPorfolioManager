import { Component, Input, OnInit } from '@angular/core';
import { BarChartOption, ChartData, ChartView } from 'ngx-chart';

@Component({
  selector: 'app-net-worth',
  templateUrl: './net-worth.component.html',
  styleUrls: ['./net-worth.component.css']
})
export class NetWorthComponent implements OnInit {
  
    chartData: ChartData[] = [
    { name: "India", value: 20, color: "#61b15a" },
    { name: "Nepal", value: 5, color: "#adce74" },
    { name: "USA", value: 1, color: "#fff76a" },
    { name: "UK", value: 2, color: "#ffce89" },
    { name: "Brazil", value: 7, color: "#d8f8b7" }
  ];
  chartOptions: BarChartOption = {
    roundedCorners: false,
    showLegend: true,
    legendTitle: 'Total',
    isHorizontal: false
  }
  barView: ChartView = {
    height: 400,
    width: 400
  }



  constructor() { }

  ngOnInit(): void {
  }

}

