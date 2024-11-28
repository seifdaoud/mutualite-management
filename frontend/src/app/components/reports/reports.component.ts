import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-reports',
  templateUrl: './reports.component.html',
})
export class ReportsComponent implements OnInit {
  reports: any[] = [
    { id: 1, title: 'Rapport Contrats', generatedAt: '2024-11-28' },
    { id: 2, title: 'Rapport Factures', generatedAt: '2024-11-28' },
  ];

  ngOnInit(): void {}

  downloadReport(reportId: number): void {
    console.log('Téléchargement du rapport ID:', reportId);
  }
}
