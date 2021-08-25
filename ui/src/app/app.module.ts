import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatSidenavModule } from '@angular/material/sidenav';
import {MatButtonModule} from '@angular/material/button';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NetWorthComponent } from './net-worth/net-worth.component';
import { InsightComponent } from './insight/insight.component';
import { MarketMoverComponent } from './market-mover/market-mover.component';
import { CashFlowComponent } from './cash-flow/cash-flow.component';
import { NgxChartModule } from 'ngx-chart';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    NetWorthComponent,
    InsightComponent,
    MarketMoverComponent,
    CashFlowComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSidenavModule,
    MatButtonModule,
    HttpClientModule,
    NgxChartModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
