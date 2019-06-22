# Market Store Backend
<h3>Assignment:</h3>
A market store offers to their clients three different types of discount cards: bronze, silver and gold.  
Each card stores information about its owner, the turnover for the previous month and the initial discount rate.  
With each card you can calculate the discount of the current purchase.

<h3>Explanation:</h3>
Application entry point is in Pay Desk class, containing static method calculateTotal and main method.  
Application starts invoking the method calculateTotal, which consumes two arguments, purchase value and card.  

There is abstract class Card, which provides default functionality for the subclasses.  
Abstract method calculateDiscount is overridden in subclasses  BronzeCard, SilverCard and GoldCard.  
Each one of them implements this method in its own way.  

Creating instances and invoking the method calculateTotal(turnover, card), results with output:  
Purchase value: $150.0  
Discount rate: 2.5%  
Discount: $3.75  
Total: $146.25
