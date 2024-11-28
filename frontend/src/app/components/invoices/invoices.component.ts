import { Component, OnInit } from '@angular/core';
import { InvoiceService } from '../../services/invoice.service';

@Component({
  selector: 'app-invoices',
  templateUrl: './invoices.component.html',
})
export class InvoicesComponent implements OnInit {
  invoices: any[] = [];

  constructor(private invoiceService: InvoiceService) {}

  ngOnInit(): void {
    this.invoiceService.getInvoices().subscribe((data) => {
      this.invoices = data;
    });
  }
}
