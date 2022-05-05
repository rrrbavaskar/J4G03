import { Component } from '@angular/core';
import { FormData } from './form-data';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public Qualification= ["B.E","pG","M.tech"];
  public Apply= ["Goverment","public","private","B.E"];
  public userModel = new FormData("Rutuja","Bavaskar","Ravindra","Female","30-04-2000","B.E","rrbavaskar2020@gmail.com","9529243944","Entc",",khamgaon,maharashtrs");
}
