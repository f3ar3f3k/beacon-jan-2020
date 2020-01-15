import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-lifecyclehook',
  templateUrl: './lifecyclehook.component.html',
  styleUrls: ['./lifecyclehook.component.css']
})
export class LifecyclehookComponent implements OnInit, OnDestroy {

  constructor() { }

  ngOnInit() {
      console.log("=====> Connected to database <=====");
  }
  
  ngOnDestroy(): void {
      console.log("=====> Close database connection <=====");
  }


}
