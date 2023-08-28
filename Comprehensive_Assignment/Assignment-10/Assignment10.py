import time
import pytest
from selenium import webdriver

from selenium.webdriver.common.by import By

from selenium.webdriver.common.action_chains import ActionChains
@pytest.fixture(scope="module")

def browser():
    driver = webdriver.Chrome()
    driver.get("https://www.automationanywhere.com/")
    driver.implicitly_wait(10)
    yield driver
    driver.quit()

def test_mouse_over_products_and_click(browser):
   # browser.find_element(By.XPATH, "/html/body/div[1]/header/div/div/div/div[2]/div/div/div[2]/ul/li[1]/a").click()
    #time.sleep(3)
    products_menu= browser.find_element(By.XPATH, "//a[contains(@href,'/products')]")

    ActionChains (browser).move_to_element (products_menu).perform()
    # time.sleep(3)
    process_discovery = browser.find_element(By.XPATH, "//a[@title='Process Discovery']")
    process_discovery.click()
def test_verify_url(browser):
    current_url = browser.current_url
    expected_url = "https://www.automationanywhere.com/products/process-discovery"
    assert current_url== expected_url, f"Expected URL: {expected_url}, but got:{current_url}"