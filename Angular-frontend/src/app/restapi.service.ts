import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestapiService {

  constructor(private http:HttpClient) { }
 

  public login(username:string, password:string){
 
    const headers = new HttpHeaders({Authorization: 'Basic ' + btoa(username + ":" + password)})
    return  this.http.get("http://localhost:4200/", {headers, responseType:'text' as 'json'});
  }  

  public getUsers(){
    let username = "CHAKFI";
    let password = "polysb";
    const headers = new HttpHeaders(
      {Authorization: 'Basic ' + btoa(username + ":" + password)})
      return  this.http.get("http://localhost:4200/home", {headers});
  }  

}
