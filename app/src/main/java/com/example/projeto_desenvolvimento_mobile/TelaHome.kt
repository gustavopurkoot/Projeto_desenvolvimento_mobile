package com.example.projeto_desenvolvimento_mobile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F2F2)) // Fundo cinza claro idêntico ao Figma
    ) {
        // CABEÇALHO VERDE
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color(0xFF008C3A))
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "OLÁ, Usuário!",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            // Ícones do topo (Telefone, Megafone/Aviso, Perfil)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                BotaoCirculoTopo()
                BotaoCirculoTopo()
                BotaoCirculoTopo()
            }
        }

        // CONTEÚDO ROLÁVEL
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // SEÇÃO: CARTÃO VIRTUAL
            item {
                Text(
                    text = "Cartão Virtual",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1C1C1C)
                )
                Spacer(modifier = Modifier.height(10.dp))

                // Cartão Cinza
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color(0xFFDCDCDC))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .width(60.dp)
                                .height(16.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(Color(0xFFC4C4C4))
                        )
                        Text(text = "Cidade - ES", fontSize = 12.sp, color = Color(0xFF555555))
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "00 0000 00 000 000 - 000",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1C1C1C)
                        )
                        // Botão de copiar
                        Box(
                            modifier = Modifier
                                .size(28.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFC4C4C4)),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(modifier = Modifier.size(12.dp).background(Color(0xFF888888)))
                        }
                    }

                    Text(
                        text = "Nome Completo do Paciente",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1C1C1C)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        // Botão Verde com ícone de olho cortado simulado
                        Box(
                            modifier = Modifier
                                .height(36.dp)
                                .weight(1f)
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFF008C3A)),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(modifier = Modifier.size(16.dp).background(Color.White))
                        }

                        // Botão "GERAR TOKEN"
                        Box(
                            modifier = Modifier
                                .height(36.dp)
                                .weight(1f)
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFF008C3A)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "GERAR TOKEN",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // SEÇÃO: FAVORITOS (Grade 3x2)
            item {
                Text(
                    text = "Favoritos",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1C1C1C)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        ItemFavorito("Serviço 1", modifier = Modifier.weight(1f))
                        ItemFavorito("Serviço 2", modifier = Modifier.weight(1f))
                        ItemFavorito("Serviço 3", modifier = Modifier.weight(1f))
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        ItemFavorito("Serviço 4", modifier = Modifier.weight(1f))
                        ItemFavorito("Serviço 5", modifier = Modifier.weight(1f))
                        ItemFavorito("Serviço 6", modifier = Modifier.weight(1f))
                    }
                }
            }

            // SEÇÃO: ACESSO RÁPIDO
            item {
                Text(
                    text = "Acesso Rápido",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1C1C1C)
                )
                Spacer(modifier = Modifier.height(10.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color(0xFFDCDCDC))
                        .padding(vertical = 4.dp)
                ) {
                    ItemAcessoRapido("Atalho de Serviço 1")
                    Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color(0xFFC4C4C4)))
                    ItemAcessoRapido("Atalho de Serviço 2")
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun BotaoCirculoTopo() {
    Box(
        modifier = Modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(14.dp)
                .background(Color(0xFF008C3A))
        )
    }
}

@Composable
fun ItemFavorito(titulo: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFDCDCDC))
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Ícone de cubo do Figma simulado por formas
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xFFC4C4C4)),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .background(Color(0xFF888888))
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = titulo,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1C1C1C)
        )
    }
}

@Composable
fun ItemAcessoRapido(texto: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(Color(0xFFC4C4C4))
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = texto,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1C1C1C)
        )
    }
}

@Preview(showBackground = true, widthDp = 412, heightDp = 892)
@Composable
fun PreviewTelaHome() {
    TelaHome()
}