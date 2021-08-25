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

  getAccountApi(){
    return this.http.get('./api/account/1');
  }

}
