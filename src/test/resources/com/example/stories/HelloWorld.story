Simple HelloWorld application to demonstrate Gradle, JBehave and Lombok.

Narrative:
In order to feel warm and fuzzy
As a user
I want my computer to greet me

Scenario:  Offer a personalised greeting
Given the name <name>
When combined with <salutation>
Then should result in <greeting>

Examples:
| name | salutation | greeting    |
| Flic | Hi         | Hi Flic!    |
| Flic | Bye        | Bye Flic!   |
| Maz  | Hello      | Hello Maz!  |
| Maz  | Goodbye    | Goodbye Maz!|