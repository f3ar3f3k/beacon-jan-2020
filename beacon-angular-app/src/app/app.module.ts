import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StartComponent } from './start/start.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { LifecyclehookComponent } from './lifecyclehook/lifecyclehook.component';

@NgModule({
  declarations: [
    AppComponent,
    StartComponent,
    ParentComponent,
    ChildComponent,
    LifecyclehookComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
