# User Guide

## Introduction

Stores all the forex rates in one place and allows the user to store different types of currency within one “bank” account/wallet.

## Quick Start


1. Ensure that you have Java 11 or above installed.
2. Download the latest version of `Duke` from [here](http://link.to/duke).

## Features 



### Registering a new wallet: `register`
Registers a new wallet for you

Format: 
  1. `register`
  2. `Please enter your username: <username>`
  3. `Please enter your password: <password>`

* The <username> has to be a unique username.
* The <password> has to be at least 8 characters long.  

Example of usage: 

`Please enter your username: testing`

`Please enter your password: password123`
  
  

### Logging into an existing wallet: `login`
Logs you into your wallet, so you can do your actions there

Format: 
  1. `login`
  2. `Please enter your username: <username>`
  3. `Please enter your password: <password>`
 

Example of usage: 

`Please enter your username: testing`

`Please enter your password: password123`
  
  

### Adding a new personal currency to the list of currencies: `new_currency`
Adds your currency to the list of currencies so that you could track that one as well

Format: 
  1. `new_currency`
  2. `Please enter your new currency's abbreviation: <abbreviation>`
  3. `Please enter your new currency's full name: <full name>`
  4. `Please enter your new currency's symbol: <symbol>`
  5. `Please enter your new currency's rate: <rate>`
  
#The rate has to be against usd, e.g 1 usd - 0.000049, you would enter 0.000049

Example of usage: 

`Please enter your new currency's abbreviation: btc`

`Please enter your new currency's full name: bitcoin`
  
`Please enter your new currency's symbol: bc`
  
`Please enter your new currency's rate: 0.000049`

  
### Removing your personal currency: `remove`
Removes your personal currency from the list of currencies

Format: 
  1. `remove`
  2. `OK, which currency would you like to remove? Enter the abbreviation of that currency: <abbreviation>`
  
#The currency has to be the one that is added by yourself, you can't remove other preset currencies

Example of usage: 

`OK, which currency would you like to remove? Enter the abbreviation of that currency: btc`

  
### Help center: `help`
Helps you deal with settings, such as changing your password, username, or default currency or deleting your account.

Format: 
  1. `help`
  2. `change default currency` , `change password`, `change username`, `delete account`, `exit`
  
#You have to be logged into an account to do that

Example of usage: 

  1. `change default currency`
  2. `current password: password123`
  3. `Enter the currency you would like to change your default to: eur`
  
  1. `change password`
  2. `current password: password123`
  3. `Enter the currency you would like to change your default to: eur`
  
  1. `change username`
  2. `current password: password123`
  3. `New username: testing1`
  
  1. `delete account`
  2. `y`
3. `exit`
  
  
  
  
### Getting balance: `balance`
Gets you your current wallet balance

Format: 
  1. `balance`
  
#You need to be logged into your wallet

Example of usage: 

`balance`
  
### Getting details: `details`
Getting a detailed view of your wallet

Format: 
  1. `details`
  
#You need to be logged into your wallet

Example of usage: 

`details`
  
  
### Depositing money to your account: `deposit`
Deposit money to your wallet

Format: 
  1. `deposit <currency> <amount>`
2. `deposit <amount>`
  
#You need to be logged into your wallet

Example of usage: 

`deposit sgd 100`
`deposit 100`
  
  
### Withdrawing money from your account: `withdraw`
Withdrawing money from your account

Format: 
  1. `withdraw <currency> <amount>`
  2. `withdraw <amount>`
  
#You need to be logged into your wallet

Example of usage: 

`withdraw sgd 100`
`withdraw 100`

### Convert money: `convert`
Convert some money in a certain currency to another one in your wallet

Format: 
  1. `convert <oldCurrency> <oldAmount> <newCurrency>`
  
#You need to be logged into your wallet

Example of usage: 

`convert sgd 100 usd`

In the example above, the command means converting 10 units of SGD to USD

### Convert all money: `convert all`
Convert all money in your wallet to a certain currency

Format: 
  1. `convert all <currency>`
  
#You need to be logged into your wallet

Example of usage: 

`convert all sgd`

In the example above, the command means converting all the money in the wallet to SGD

### Listing currencies: `list`
Lists a detailed view of all the currencies that are available

Format: 
  1. `list`
  
#You need to be in the currencies section

Example of usage: 

`list`
  
 
### Transferring currencies: `transfer`
Transfer an amount of money to another wallet

Format: 
  1. `transfer <recipient> <amount> <currency>`
  
#You need to be logged into your account

Example of usage: 

`transfer testing2 100 sgd`
  
 
### Currencies section: `currencies`
Get to the currencies section

#Can be called inside or outside your wallet

Format: 
  1. `currencies`
  

Example of usage: 

`currencies`
  
  
### Currency information: `info`
Get information about a certain currency

Format: 
  1. `info <abbreviation>`
  

Example of usage: 
`info sgd`

  
### Conversion: `conversion`
Get information about a certain currency

Use number 1 when inside your account to get the conversion from the given currency to your default currency

Format: 
  1. `conversion <abbreviation>`
  2. `conversion <abbreviation> <abbreviation>`

Example of usage: 
`conversion sgd`
`conversion sgd usd`

### Exit: `exit`
Exit from the currency center

Format:
1. `exit`

Example of usage:
`exit`

### Log Out: `logout/ log out`
Log out of your account

Format:
1. `logout`
2. `log out`

Log out of your account and get back to the home screen
  
## FAQ
**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary
#login
#register
#Please enter your username: <username>
#Please enter your password: <password>
  
#new_currency
#Please enter your new currency's abbreviation: <abbreviation>
#Please enter your new currency's full name: <full name>
#Please enter your new currency's symbol: <symbol>
#Please enter your new currency's rate: <rate>
  
#remove
#OK, which currency would you like to remove? Enter the abbreviation of that currency: <abbreviation>
#change default currency
  
#password: password123
#Enter the currency you would like to change your default to: eur
  
#change password
#password: password123
#Enter the currency you would like to change your default to: eur
  
#change username
#password: password123
#New username: testing1
  
#delete account
#y
  
#balance
  
#detail
  
#save <currency> <amount>
#save <amount>
  
#withdraw <currency> <amount>
#withdraw <amount>

#convert
#convertAll
#setDefault

#list
  
#transfer <recipient> <amount> <currency>
  
#info

#conversion <abbreviation>
#conversion <abbreviation> <abbreviation>
