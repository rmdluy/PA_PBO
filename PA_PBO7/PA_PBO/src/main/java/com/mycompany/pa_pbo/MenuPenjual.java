
package com.mycompany.pa_pbo;

import java.io.IOException;

public interface MenuPenjual {
    void BuatToko() throws IOException;
    void TampilToko() throws IOException;
    void EditToko() throws IOException;
    void HapusToko() throws IOException;
    void Logout(); 
    void Menu() throws IOException;
}
