# Car Rental System

Um sistema simples de locação de carros desenvolvido em Java. O projeto calcula o pagamento básico e impostos de acordo com o tempo de aluguel e a política de taxas do país selecionado (Brasil ou EUA).

---

## Tecnologias Utilizadas

- Java SE 8 ou superior
- Conceitos de Orientação a Objetos (OO)
- Interfaces e polimorfismo
- Manipulação de datas (`java.util.Date`, `SimpleDateFormat`)
- Estrutura de pacotes

---

## Estrutura do Projeto
application/ -> Classe principal (Program.java)
entities/ -> Entidades do sistema (CarRental, Vehicle, Invoice)
services/ -> Serviços e regras de negócio (RentalService, TaxService, BrazilTaxService, EuaTaxService)

---

## Funcionalidades

- Registro de dados de aluguel (modelo do carro, data de retirada e devolução)
- Cálculo automático do pagamento básico com base em preço por hora ou dia
- Cálculo de impostos com diferentes regras para Brasil e EUA
- Emissão de fatura com pagamento total

---



   Enter rental data:
Car model: Civic
Pickup (dd/MM/yyyy hh:mm): 15/08/2025 10:00
Return (dd/MM/yyyy hh:mm): 16/08/2025 11:30
Enter price per hour: 10.0
Enter price per day: 130.0

INVOICE:
Basic payment: 260.00
Tax: 78.00
Total payment: 338.00

