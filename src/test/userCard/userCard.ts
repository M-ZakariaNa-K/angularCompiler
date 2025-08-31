import { Component, Input } from '@angular/core';

@Component({
  selector: "app-user-list",
  templateUrl: './userCard.html',
  styleUrls: ['./user-card.component.css']
})
export class UserCardComponent {

  getUserInitials(): string {
    return "d";
  }
}
