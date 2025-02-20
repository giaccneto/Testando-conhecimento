package com.example.testando.service;

import com.example.testando.entity.Produto;
import com.example.testando.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    public ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @Transactional
    public Produto salvaProduto(Produto produto) {
        return produtoRepository.save(produto);
    }


    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }


    public Produto buscaPorId(Long id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
    }

    public void deletarPorId(Long id){
         produtoRepository.deleteById(id);

    }
}
