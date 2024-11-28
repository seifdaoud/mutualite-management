import { Component } from '@angular/core';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
})
export class NotificationsComponent {
  preferences = {
    email: true,
    sms: false,
    push: true,
  };

  sauvegarderPreferences(): void {
    console.log('Préférences sauvegardées:', this.preferences);
  }
}
