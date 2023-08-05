Feature: Validate the Get request

Scenario: Validate the Get request for book
Given hit the URI2
Then validate subTitle "A JavaScript and jQuery Developer's Guide" and isbn "9781449331818" and author "Addy Osmani" and publish_date "2020-06-04T09:11:40.000Z" of the book