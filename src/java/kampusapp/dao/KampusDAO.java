/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampusapp.dao;

import java.util.List;
import kampusapp.model.Mahasiswa;

/**
 *
 * @author emanu
 */
public interface KampusDAO {
    List<Mahasiswa> get();
    boolean save(Mahasiswa mahasiswa);
}
