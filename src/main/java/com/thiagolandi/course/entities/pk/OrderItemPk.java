package com.thiagolandi.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.thiagolandi.course.entities.Order;
import com.thiagolandi.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Isso diz que a classe OrderItemPk é uma classe incorporável , ou seja, ela será usada como parte de outra classe (normalmente em OrderItem). Não será uma tabela separada no banco de dados, mas seus atributos farão parte da tabela que usa essa chave.
@Embeddable
public class OrderItemPk implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// Ou seja, cada entrada na tabela tb_order_item precisa estar associada a um único pedido e a um único produto, mas o mesmo pedido pode conter vários produtos, e o mesmo produto pode estar associado a vários pedidos.
	
	// muitos itens podem ter estar relacionado a um unico order ou product
	@ManyToOne
	@JoinColumn(name = "order_id")// cria uma coluna e dá o nome dela
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}
	
	

}
