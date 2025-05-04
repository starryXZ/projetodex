# Ddex
  Projeto para um pequeno site de venda
## Diagrama de classes

``` mermaid
classDiagram
  class Produto {
    +String Nome
    +String id
    +Boolean inStock
    +String category
    +List~String~ tags
    +String Subtitulo
    +String Preço
    +String Descrição
    +String Button
    +String TextBox
  }

  class RelatedProduct {
    +String name
    +String description
    +String price
  }

  class SiteDeVendas {
    +Produto produto
    +List~RelatedProduct~ relatedProducts
  }

  SiteDeVendas --> Produto : contém
  SiteDeVendas --> RelatedProduct : contém múltiplos
