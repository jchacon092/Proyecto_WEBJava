package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.TblCategoria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOCategoria {

    public List<TblCategoria> getCategoria() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        List<TblCategoria> listado = s.createQuery("from TblCategoria").list();
        s.close();
        return listado;
    }
}

//           SessionFactory sf= HibernateUtil.getSessionFactory();
//           Session s= sf.openSession();
//           Transaction tran= s.beginTransaction();
//           ArrayList<TblCategoria> arreglo= new ArrayList<TblCategoria>();
//           Query q=s.createQuery("from TblCategoria");
//           List<TblCategoria> listado=q.list();
//           Iterator<TblCategoria> iter=listado.iterator();
//           tran.commit();
//           s.close();
//           while(iter.hasNext())
//           {
//              TblCategoria noti=(TblCategoria) iter.next();
//              arreglo.add(noti);
//           }
//           return arreglo;