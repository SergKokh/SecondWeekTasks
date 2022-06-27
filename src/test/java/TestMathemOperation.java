import MethodMulti.MultiChisel;
import MethodSubtraction.SubtractionChisel;
import MethodSumma.SummaChisel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathemOperation {

    @Test
    public void SummaTreh1(){
        Assert.assertEquals(SummaChisel.Summa(5, 8,7), 20);
    }

    @Test
    public void SummaTreh2(){
        Assert.assertEquals(SummaChisel.Summa(10, 20, 30), 60);
    }
    @Test
    public void SummaTreh(){
        Assert.assertFalse(SummaChisel.Summa(10,20,30)==50);
    }
    @Test
    public void SummaTreh3() {
        Assert.assertFalse(SummaChisel.Summa(110, 12, 50) == 50);
    }
    @Test
    public void SummaTreh4() {
        Assert.assertTrue(SummaChisel.Summa(5, 5, 5) == 15);
    }
    @Test
    public void SummaTreh5() {
        Assert.assertEquals(SummaChisel.Summa(5, 5, 5),15);
    }

    @Test
    public void SummaDvuh(){
        Assert.assertEquals(SummaChisel.Summa(10,20), 30);
    }

    @Test
    public void Summadvuh1(){
        Assert.assertTrue(SummaChisel.Summa(10,20) == 30);
    }
    @Test
    public void SummaDvuh2(){
        Assert.assertFalse(SummaChisel.Summa(10,20)==20);
    }
    @Test
    public void SummaDvuh3(){
        Assert.assertEquals(SummaChisel.Summa(10,20),30);
    }
    @Test
    public void SummaDvuh4(){
        Assert.assertEquals(SummaChisel.Summa(10,90),100);
    }

    @Test
    public void SummaDvuh5(){
        Assert.assertEquals(SummaChisel.Summa(15,80),95);
    }
    @Test
    public void MultiDvohChisel(){
        Assert.assertEquals(MultiChisel.multi(2,3),6);
    }
    @Test
    public void MultiDvohChisel1(){
        Assert.assertEquals(MultiChisel.multi(10,3),30);
    }
    @Test
    public void MultiDvohChisel2(){
        Assert.assertEquals(MultiChisel.multi(2,3),6);
    }
    @Test
    public void MultiDvohChisel3(){
        Assert.assertEquals(MultiChisel.multi(5,5),25);
    }@Test
    public void MultiDvohChisel4(){
        Assert.assertTrue(MultiChisel.multi(5,6)==30);
    }
    @Test
    public void MultiDvohChisel5(){
        Assert.assertFalse(MultiChisel.multi(2,3)==8);
    }
    @Test
    public void MultiTrehChisel(){
        Assert.assertEquals(MultiChisel.multi(1,2,3),6);
    }
    @Test
    public void MultiTrehChisel1(){
        Assert.assertTrue(MultiChisel.multi(1,2,3)==6);
    }
    @Test
    public void MultiTrehChisel2(){
        Assert.assertFalse(MultiChisel.multi(1,2,3)==8);
    }
    @Test
    public void MultiTrehChisel3(){
        Assert.assertEquals(MultiChisel.multi(2,3,4),24);
    }
    @Test
    public void MultiTrehChisel4(){
        Assert.assertTrue(MultiChisel.multi(2,3,4)==24);
    }
    @Test
    public void MultiTrehChisel5(){
        Assert.assertFalse(MultiChisel.multi(2,3,4)== 99);
    }
    @Test
    public void SubtractionTreh(){
        Assert.assertEquals(SubtractionChisel.subtraction(25,10,5),10);
    }
    @Test
    public void SubtractionTreh1(){
        Assert.assertEquals(SubtractionChisel.subtraction(18,10,8),0);
    }
    @Test
    public void SubtractionTreh2(){
        Assert.assertEquals(SubtractionChisel.subtraction(22,12,5),5);
    }
    @Test
    public void SubtractionTreh3(){
        Assert.assertTrue(SubtractionChisel.subtraction(25,10,5)==10);
    }
    @Test
    public void SubtractionTreh4(){
        Assert.assertFalse(SubtractionChisel.subtraction(25,10,5)==5);
    }
    @Test
    public void SubtractionTreh5(){
        Assert.assertEquals(SubtractionChisel.subtraction(100,25,25),50);
    }
    @Test
    public void SubtractionDvuh(){
        Assert.assertEquals(SubtractionChisel.subtraction(40,20),20);
    }
    @Test
    public void SubtractionDvuh1(){
        Assert.assertEquals(SubtractionChisel.subtraction(23,13),10);
    }
    @Test
    public void SubtractionDvuh2(){
        Assert.assertTrue(SubtractionChisel.subtraction(40,20)==20);
    }
    @Test
    public void SubtractionDvuh3(){
        Assert.assertFalse(SubtractionChisel.subtraction(40,20)==10);
    }
    @Test
    public void SubtractionDvuh4(){
        Assert.assertEquals(SubtractionChisel.subtraction(400,20),380);
    }
    @Test
    public void SubtractionDvuh5(){
        Assert.assertEquals(SubtractionChisel.subtraction(99,20),79);
    }


}
