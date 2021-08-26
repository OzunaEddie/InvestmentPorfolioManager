import { Injectable } from '@angular/core';

// I want to use http in this service
import { HttpClient} from '@angular/common/http'


@Injectable({
  providedIn: 'root'
})
export class TypicodeService {

  // this is classic to for http
  constructor(private http:HttpClient) { }

  // we need a method of this service - in this case we call an api end-point

  getAccountByIdApi(accountId:number){
    return this.http.get(`./api/account/${accountId}`);
  }

  getStockByIdApi(stockId:number){
    return this.http.get(`./api/stock/${stockId}`);
  }

  getBondByIdApi(bondId:number){
    return this.http.get(`./api/bond/${bondId}`);
  }

  getEtfByIdApi(etfId:number){
    return this.http.get(`./api/etf/${etfId}`);
  }

  getMostGainer(){
    return this.http.get("https://financialmodelingprep.com/api/v3/gainers?apikey=15ed8cd2b659685092b6f36aeb219685")
  }

  getMostLoser(){
    return this.http.get("https://financialmodelingprep.com/api/v3/losers?apikey=15ed8cd2b659685092b6f36aeb219685")
  }

}
