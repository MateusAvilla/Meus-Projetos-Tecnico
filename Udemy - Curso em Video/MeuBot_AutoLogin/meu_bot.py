from selenium import webdriver
from time import sleep



class InstaBot:
    def __init__(self, username, pw):
        self.driver = webdriver.Chrome()
        self.username = username
        self.pw = pw
        self.driver.get("https://server.pro/13735540")
        sleep(1)
        self.driver.find_element_by_xpath("//input[@id=\"email\"]")\
            .send_keys(username)
        self.driver.find_element_by_xpath("//input[@id=\"password\"]")\
            .send_keys(pw)    
        self.driver.find_element_by_xpath("//button[@class=\"button-primary\"]")\
            .click()    
        sleep(1)

my_bot = InstaBot('childrude.maisq3@gmail.com', 'egido123')