import { Component, OnInit } from '@angular/core';
import { TypicodeService } from 'src/services/typicode.service';

@Component({
  selector: 'app-market-mover',
  templateUrl: './market-mover.component.html',
  styleUrls: ['./market-mover.component.css']
})
export class MarketMoverComponent implements OnInit {

  topGainerList:any = []

  constructor(private typicodeService:TypicodeService) {
    
  }

  ngOnInit(): void {
    this.getMostGainer()
    this.getMostLost()
  }

  getMostGainer(){
    this.typicodeService.getMostGainer().subscribe( (data) => {
      console.log(data)
    });
  }

  getMostLost(){
    this.typicodeService.getMostLoser().subscribe( (data) => {
      console.log(data)
    });
  }

}
