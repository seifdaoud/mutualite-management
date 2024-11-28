import { Component } from '@angular/core';
import { RgpdService } from '../../services/rgpd.service';

@Component({
  selector: 'app-rgpd',
  templateUrl: './rgpd.component.html',
})
export class RgpdComponent {
  constructor(private rgpdService: RgpdService) {}

  onExportData() {
    this.rgpdService.exportData().subscribe((data) => {
      console.log('Exported data:', data);
    });
  }

  onRequestDataDeletion() {
    this.rgpdService.requestDataDeletion().subscribe(() => {
      console.log('Data deletion requested successfully.');
    });
  }
}
