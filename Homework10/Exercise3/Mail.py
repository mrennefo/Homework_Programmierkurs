
class Mail:
    def __init__(self, sender, subject, message, datetime):
        self.sender = sender
        self.subject = subject
        self.message = message
        self.datetime = datetime
        self.read = False

    def markAsRead(self):
        self.read = True


    def toString(self):
        print(self.subject, "from", self.sender, "on", self.datetime, ":", self.message)

class Inbox:
    def __init__(self):
        self.inbox = []

    def countUnread(self):
        counter = 0
        for i in range(len(self.inbox)):
            if self.inbox[i].read == False:
                counter += 1
        return counter

    def open(self, index):
        if index <= len(self.inbox):
            self.inbox[index].read = True


if __name__ == '__main__':
    mail1 = Mail("alice@example.com", "Meeting Reminder", "Don't forget our meeting at 10 AM.", "2025-06-26 08:00")
    mail2 = Mail("bob@example.com", "Lunch?", "Wollen wir heute Mittag essen gehen?", "2025-06-26 10:30")
    mail3 = Mail("carol@example.com", "Projektstatus", "Wie weit bist du mit dem Bericht?", "2025-06-25 16:45")
    mail4 = Mail("dan@example.com", "Urlaub", "Ich bin nächste Woche im Urlaub.", "2025-06-24 09:15")
    mail5 = Mail("eva@example.com", "Happy Birthday!", "Alles Gute zum Geburtstag 🎉", "2025-06-23 00:01")
    mail6 = Mail("frank@example.com", "Rechnung", "Anbei die Rechnung für Mai.", "2025-06-22 14:50")
    mail7 = Mail("gina@example.com", "Neue Telefonnummer", "Ich habe eine neue Nummer: 01234 567890", "2025-06-21 17:20")
    mail8 = Mail("harry@example.com", "GitHub Repo", "Schau dir mal dieses Repo an: https://github.com/example", "2025-06-20 11:05")

    inbox = Inbox()
    inbox.inbox = [mail1, mail2, mail3, mail4, mail5, mail6, mail7, mail8]
    print(inbox.countUnread())
    inbox.open(6)
    inbox.open(10)
    inbox.open(0)
    inbox.open(2)
    print(inbox.countUnread())