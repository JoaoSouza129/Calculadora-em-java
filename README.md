# Calculadora em Java 🧮

Uma calculadora gráfica simples desenvolvida em Java usando a biblioteca Swing, com interface inspirada na calculadora do iOS.

## 📋 Características

- **Interface Gráfica Intuitiva**: Design moderno inspirado na calculadora do iOS
- **Operações Básicas**: Adição, subtração, multiplicação e divisão
- **Funções Especiais**:
  - Raiz quadrada (√)
  - Porcentagem (%)
  - Inversão de sinal (+/-)
  - Limpeza total (AC - All Clear)
- **Suporte a Decimais**: Trabalha com números decimais
- **Layout Responsivo**: Interface organizada em grid 5x4

## 🎨 Interface

A calculadora possui três tipos de botões com cores distintas:
- **Cinza Claro**: Funções especiais (AC, +/-, %)
- **Laranja**: Operadores matemáticos (÷, ×, -, +, =)
- **Preto**: Números (0-9) e ponto decimal (.)

## 🚀 Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 8 ou superior
- Um terminal/prompt de comando

### Compilação e Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/JoaoSouza129/Calculadora-em-java.git
   cd Calculadora-em-java
   ```

2. **Compile o código**:
   ```bash
   javac src/Main.java
   ```

3. **Execute a aplicação**:
   ```bash
   java -cp src Main
   ```

### Execução Alternativa (IDE)
Você também pode abrir o projeto em qualquer IDE Java (IntelliJ IDEA, Eclipse, NetBeans) e executar a classe `Main` diretamente.

## 📁 Estrutura do Projeto

```
Calculadora-em-java/
├── src/
│   └── Main.java          # Código principal da calculadora
├── .idea/                 # Configurações do IntelliJ IDEA
├── .gitignore            # Arquivos ignorados pelo Git
├── Calculadora.iml       # Arquivo de módulo do IntelliJ
└── README.md             # Este arquivo
```

## 🔧 Funcionalidades Técnicas

### Botões e Layout
- **Display**: JLabel com fonte Arial 80pt, alinhamento à direita
- **Painel de Botões**: GridLayout 5x4 para organização dos botões
- **Cores**: Sistema de cores customizado com RGB específicos

### Operações Implementadas

#### Operações Básicas
- **Adição (+)**: Soma de dois números
- **Subtração (-)**: Diferença entre dois números
- **Multiplicação (×)**: Produto de dois números
- **Divisão (÷)**: Quociente de dois números

#### Funções Especiais
- **Raiz Quadrada (√)**: Calcula a raiz quadrada do número atual
- **Porcentagem (%)**: Converte o número atual em porcentagem (divide por 100)
- **Inversão de Sinal (+/-)**: Multiplica o número atual por -1
- **All Clear (AC)**: Limpa todas as variáveis e reseta para 0

### Tratamento de Decimais
A calculadora possui uma função `removeZeroDecimal()` que:
- Remove zeros desnecessários após a vírgula decimal
- Converte números inteiros para formato sem casas decimais
- Mantém a precisão para números decimais verdadeiros

## 💻 Detalhes de Implementação

### Variáveis Globais
```java
static String a = "0";          // Primeiro operando
static String operador = null;  // Operador atual (+, -, ×, ÷)
static String b = null;         // Segundo operando
```

### Cores Personalizadas
```java
Color lightGray = new Color(212,212,210);  // Botões de função
Color orange = new Color(255, 149, 0);     // Botões de operação
Color black = new Color(28,28,28);         // Background e números
```

## 🎯 Como Usar

1. **Digite números**: Clique nos botões numéricos (0-9)
2. **Operações**: Clique em +, -, ×, ou ÷
3. **Digite o segundo número**
4. **Calcule**: Clique em = para obter o resultado
5. **Funções especiais**:
   - **AC**: Limpa tudo
   - **+/-**: Inverte o sinal do número
   - **%**: Converte para porcentagem
   - **√**: Calcula raiz quadrada
   - **.**: Adiciona ponto decimal

## 🐛 Limitações Conhecidas

- A divisão por zero não possui tratamento específico
- Não há limite para o número de dígitos no display
- Operações consecutivas requerem pressionar = entre cada operação

## 🛠️ Possíveis Melhorias

- [ ] Tratamento de erros (divisão por zero, overflow)
- [ ] Histórico de cálculos
- [ ] Suporte a operações científicas
- [ ] Teclado numérico como entrada
- [ ] Temas personalizáveis
- [ ] Operações em cadeia (sem precisar pressionar =)

## 📄 Licença

Este projeto é de código aberto e está disponível sob licença MIT.

## 👤 Autor

Desenvolvido por [JoaoSouza129](https://github.com/JoaoSouza129)

---

💡 **Dica**: Para desenvolvedores iniciantes em Java Swing, este projeto é um excelente exemplo de como criar interfaces gráficas simples e funcionais!