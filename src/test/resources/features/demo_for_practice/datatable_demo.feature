Feature: Datatable demo

  Scenario: dummy datatable - single column with multiple rows and no header
    Given my credential
      |john    |
      |john1234|

  Scenario: dummy datatable - single row with header
    Given my credential having single row with header
      |user    |pwd     |
      |john    |john1234|

  Scenario: dummy datatable - multiple rows with header
    Given my credential having multiple row with header
      |user    |pwd     |
      |John    |john1234|
      |Bill    |bill1234|


  Scenario: dummy datatable - multiple columns single row and no header
    Given my credential multiple columns single row and no header
      |john    |john1234|


  Scenario: dummy datatable - multiple columns multiple row and no header
    Given my credential multiple columns multiple rows and no header
      |john        |john1234|
      |Bill        |Bill1234|
      |Jack        |jack1234 |
      |Himanshu    |Him1234  |
      |Jack2       |jack12234|