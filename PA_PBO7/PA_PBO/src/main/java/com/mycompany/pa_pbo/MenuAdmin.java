package com.mycompany.pa_pbo;

import java.io.IOException;

public interface MenuAdmin {
    void menu() throws IOException;
    void createData() throws IOException;
    void readData() throws IOException;
    void updateData() throws IOException;
    void deleteData() throws IOException;
    void Logout();
}
