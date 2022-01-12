/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampusapp.webcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kampusapp.dao.KampusDAO;
import kampusapp.dao.KampusDAOProses;
import kampusapp.model.Mahasiswa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author emanu
 */
@Controller
public class MahasiswaController {
    KampusDAO mhsDao=null;
    public MahasiswaController(){
        mhsDao=new KampusDAOProses();
    }
    
    @RequestMapping(value="/mahasiswa-form")
    public ModelAndView index(HttpServletRequest req,HttpServletResponse res){
        ModelAndView modelandview=new ModelAndView();
        modelandview.addObject("message", req.getParameter("message"));
        return modelandview;
    }
    
    @RequestMapping(value="/mahasiswa-form",method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("mahasiswa") Mahasiswa mh){
        ModelAndView modelandview=new ModelAndView("redirect:/mahasiswa-form.html");
        if(mhsDao.save(mh)){
            return new ModelAndView("redirect:/home.html");
            }else{
                modelandview.addObject("message", "Gagal simpan data");
            }
       
        return modelandview;
    }
}
