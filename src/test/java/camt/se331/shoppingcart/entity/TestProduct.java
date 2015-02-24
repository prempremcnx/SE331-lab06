package camt.se331.shoppingcart.entity;

import camt.se331.shoppingcart.dao.NewProductDao;
import camt.se331.shoppingcart.dao.ProductDao;
import junitparams.JUnitParamsRunner;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
@RunWith(JUnitParamsRunner.class)

/**
 * Created by PREMPREM on 24/2/2558.
 */
public class TestProduct {
    @Test
    public void testNetPrice(){
        ProductDao product = new NewProductDao();
        VatEntity.getInstance().setVat(0.1);
        assertThat(product.getProduct(1l).getNetPrice(), is(900.00));

        VatEntity.getInstance().setVat(0.05);
        assertThat(product.getProduct(2l).getNetPrice(),is(1900.00));

        VatEntity.getInstance().setVat(0.0);
        assertThat(product.getProduct(3l).getNetPrice(),is(2500.00));

        VatEntity.getInstance().setVat(1);
        assertThat(product.getProduct(4l).getNetPrice(),is(0.00));
    }
}
