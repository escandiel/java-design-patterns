import santander.dio.FactoryMethod.Factory;
import santander.dio.FactoryMethod.FactoryProdutoA;
import santander.dio.FactoryMethod.FactoryProdutoB;
import santander.dio.FactoryMethod.Produto;
import santander.dio.Singleton.SingletonEager;
import santander.dio.Singleton.SingletonLazy;
import santander.dio.Singleton.SingletonLazyHolder;
import santander.dio.Strategy.*;
import santander.dio.Facade.Facade;

public class Main {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Escandi", "998998");

        //FactoryMethod

        Factory factoryA = new FactoryProdutoA();
        Produto produtoA = factoryA.criarProduto();
        produtoA.criar();

        Factory factoryB = new FactoryProdutoB();
        Produto produtoB = factoryB.criarProduto();
        produtoB.criar();

    }
}