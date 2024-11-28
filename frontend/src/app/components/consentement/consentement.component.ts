import { Component, OnInit } from '@angular/core';
import { ConsentementService } from '../../services/consentement.service';
import { Consentement } from '../../models/consentement';

@Component({
  selector: 'app-consentement',
  templateUrl: './consentement.component.html',
})
export class ConsentementComponent implements OnInit {
  consentements: Consentement[] = [];

  constructor(private consentementService: ConsentementService) {}

  ngOnInit(): void {
    this.consentementService.getAllConsentements().subscribe((data) => {
      this.consentements = data;
    });
  }

  revokeConsent(id: number): void {
    this.consentementService.revokeConsentement(id).subscribe(() => {
      this.consentements = this.consentements.filter(c => c.idConsentement !== id);
    });
  }
}
