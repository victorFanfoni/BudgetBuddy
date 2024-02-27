# BudgetBuddy

API Rest do projeyo Budget Buddy - controle de gastos

## Requisistos

- [ ] Crud de Categoria 
- [ ] CRUD de Movimentacoes
- [ ] CRUD de Usuaruio
- [ ] Autenticacao
- [ ] Dashboard

## Documentacao

### Endpoints

- [istar Categorias](#listar-categorias)
- [Cadastrar Categoria](#Cadastrar-categoria)
- [Apagar Categoria](#apagar-categoria)
- [Detalhar categoria](#detalhar-categoria)
- [Atualizar Categoria](#atualizar-categoria)

### Listar Categorias

`GET` /categoria

Retorna um array com todas as categorias cadastradas pelo usuario atual.

#### Exemplo de Resposta

```js
[
    {
        "id":1,
        "Nome": "Alimentacao",
        "Icone": "fast-food"
    }
]
```

#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|200| Categorias retornadas com sucesso
|401| Usuario nao autorizado. Realize a autenticacao em /login

---

### Cadastrar categoria

`POST` /categoria

Cadastro uma categoria com os dados enviados no corpo da requisicao

#### Corpo da Requisicao

|campo|tipo|obrigatorio|descricao|
|-----|----|-----------|---------|
|nome|String|✅| Um nome curto para identificar a categoria
|icone|string|❌| O nome do icone conforme biblioteca material Icons

```js
{
    "Nome": "Alimentacao",
    "Icone": "fast-food" 
}
```

#### Exemplo de Resposta

```js
[
    {
        "id":1,
        "Nome": "Alimentacao",
        "Icone": "fast-food"
    }
]
```

#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|201| Categorias cadastradas com sucesso
|400| Validacao falhou. Verifique os dados enviados no corpo da requisicao
|401| Usuario nao autorizado. Realize a autenticacao em /login

---

### Apagar Categoria

`DELETE` /categoria/`[id]`
Apaga a categoria com o `id`informado no parametro de path

#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|204| Categorias apagada com sucesso
|401| Usuario nao autorizado. Realize a autenticacao em /login
---

### Detalhar Categoria

`GET` /categoria/`{id}`

Retorna os dados da categoria com o `id` informado no parametro de path.


#### Exemplo de Resposta

```js
// requisicao /categoria/1
[
    {
        "id":1,
        "Nome": "Alimentacao",
        "Icone": "fast-food"
    }
]
```


#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|200| Categorias retornada com sucesso
|401| Usuario nao autorizado. Realize a autenticacao em /login
|404| Nao exixte categoria com o `id` informado
---

### Atualizar categoria

`PUT`  /categoria/`{id}`

Atualiza os dados da categoria com o `id` informado no path


#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|200| Categorias retornadas com sucesso
|401| Usuario nao autorizado. Realize a autenticacao em /login

---

### Cadastrar categoria

`POST` /categoria

Cadastro uma categoria com os dados enviados no corpo da requisicao

#### Corpo da Requisicao

|campo|tipo|obrigatorio|descricao|
|-----|----|-----------|---------|
|nome|String|✅| Um nome curto para identificar a categoria
|icone|string|✅| O nome do icone conforme biblioteca material Icons

```js
{
    "Nome": "Alimentacao",
    "Icone": "fast-food" 
}
```

#### Exemplo de Resposta

```js
[
    {
        "id":1,
        "Nome": "Alimentacao",
        "Icone": "fast-food"
    }
]
```

#### Codigos de Resposta

| codigo | descriacao |
|--------|------------|
|201| Categorias cadastradas com sucesso
|400| Validacao falhou. Verifique os dados enviados no corpo da requisicao
|401| Usuario nao autorizado. Realize a autenticacao em /login
|404| Nao exixte categoria com o `id` informado
---