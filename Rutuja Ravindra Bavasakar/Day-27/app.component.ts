import { Component } from '@angular/core';
import { FormData } from './form-data';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public courses = ["Angular","React","Vue"];
  public userModel = new FormData("Rutuja Bavaskar","rrbavaskar2020@gmail.com","9529243944","Angular","evening",true);

}
